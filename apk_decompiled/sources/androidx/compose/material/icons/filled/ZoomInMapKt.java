package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZoomInMapKt {
    private static ImageVector _zoomInMap;

    public static final ImageVector getZoomInMap(Icons.Filled filled) {
        ImageVector imageVector = _zoomInMap;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ZoomInMap", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.0f, 9.0f, 0.0f, -6.0f);
        e.lineTo(7.0f, 3.0f);
        e.lineToRelative(0.0f, 2.59f);
        e.lineTo(3.91f, 2.5f);
        e.lineTo(2.5f, 3.91f);
        e.lineTo(5.59f, 7.0f);
        e.lineTo(3.0f, 7.0f);
        gy.B(e, 0.0f, 2.0f, 9.0f, 9.0f);
        e.moveTo(21.0f, 9.0f);
        e.verticalLineTo(7.0f);
        e.lineToRelative(-2.59f, 0.0f);
        e.lineToRelative(3.09f, -3.09f);
        e.lineTo(20.09f, 2.5f);
        e.lineTo(17.0f, 5.59f);
        e.verticalLineTo(3.0f);
        e.lineToRelative(-2.0f, 0.0f);
        gy.B(e, 0.0f, 6.0f, 21.0f, 9.0f);
        e.moveTo(3.0f, 15.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.horizontalLineToRelative(2.59f);
        e.lineTo(2.5f, 20.09f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineTo(7.0f, 18.41f);
        e.lineTo(7.0f, 21.0f);
        e.horizontalLineToRelative(2.0f);
        gy.B(e, 0.0f, -6.0f, 3.0f, 15.0f);
        e.moveTo(15.0f, 15.0f);
        r6.q(e, 0.0f, 6.0f, 2.0f, -2.59f);
        e.lineToRelative(3.09f, 3.09f);
        e.lineToRelative(1.41f, -1.41f);
        r6.w(e, 18.41f, 17.0f, 21.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 15.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _zoomInMap = build;
        build.getClass();
        return build;
    }
}
