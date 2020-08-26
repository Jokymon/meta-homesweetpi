SUMMARY = "Unblock all devices at startup"
DESCRIPTION = "Systemd service file for soft-unblocking all devices at startup"
RDEPENDS_${PN} = "rfkill"
REQUIRED_DISTRO_FEATURES = "systemd"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://rfkill-unblock.service \
"

inherit systemd

SYSTEMD_SERVICE_${PN} = "rfkill-unblock.service"
SYSTEMD_AUTO_ENABLE = "enable"

FILES_${PN} += " rfkill-unblock.service"

do_install () {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/rfkill-unblock.service ${D}${systemd_unitdir}/system
}
