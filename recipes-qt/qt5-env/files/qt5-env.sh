#!/bin/sh

export PATH=${PATH}:/usr/bin/qt5

export XDG_RUNTIME_DIR=/tmp/runtime-${USER}

export QT_QPA_PLATFORM=eglfs
export QT_QPA_EGLFS_HIDECURSOR=1
