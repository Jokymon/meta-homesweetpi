FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SUMMARY = "Linux kernel customization for th Homesweet-Pi RaspberryPi image"

inherit kernel

SRC_URI += "\
	file://rfkill.cfg \
"
