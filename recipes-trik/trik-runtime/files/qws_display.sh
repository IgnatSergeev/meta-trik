#!/bin/sh

mode=$(cat /sys/class/graphics/fb0/modes | sed "s/^ *U: *\([0-9]*\).*/\1/;t;d")
if [ x$mode = x320 ]
then
        QWS_DISPLAY="transformed:rot90"
fi
export QWS_DISPLAY=$QWS_DISPLAY

