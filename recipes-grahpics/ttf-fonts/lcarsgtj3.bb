SUMMARY = "LCARS font"

LICENSE = "CC-BY-NC-SA-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/CC-BY-NC-SA-3.0;md5=b285975b5e439d99c95bcba5b5a8cf39"

inherit fontcache

FONT_PACKAGES = "${PN}"

SRC_URI = "https://gtjlcars.de/LCARSGTJ3.zip"
SRC_URI[md5sum] = "180eb58695823d9b6b22d4d95ff18c70"

do_install () {
    install -d ${D}${datadir}/fonts/ttf
    for i in ${WORKDIR}/*.ttf; do
        install -m 0644 $i ${D}${datadir}/fonts/ttf
    done
}

FILES_${PN} = "${datadir}/fonts"
