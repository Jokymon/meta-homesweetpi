include recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_FSTYPES += "rpi-sdimg"

IMAGE_INSTALL_append = "\
	rpio \
	rpi-gpio \
	usbutils \
	connman \
	connman-client \
	openssl \
	iptables \
	iw \
	wireless-regdb-static \
	rfkill-unblock \
	wpa-supplicant \
	linux-firmware-rpidistro-bcm43430 \
	kernel-module-brcmfmac \
	bluez5 \
\
	lcarsgtj3 \
\
	qtbase \
	qtbase-plugins \
	qtbase-tools \
	qtdeclarative \
	qtdeclarative-plugins \
	qtquickcontrols \
	qtquickcontrols2 \
\
	qt5-env \
"

IMAGE_FEATURES += "ssh-server-dropbear"

inherit populate_sdk_qt5
