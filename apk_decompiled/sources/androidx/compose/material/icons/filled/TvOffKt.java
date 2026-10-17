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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.Filled filled) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TvOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.0f, 3.54f, 1.53f, 1.53f);
        e.curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f);
        e.verticalLineToRelative(12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(15.46f);
        e.lineToRelative(2.0f, 2.0f);
        e.lineToRelative(1.26f, -1.27f);
        r6.C(e, 2.27f, 2.27f, 1.0f, 3.54f);
        kp0.t(e, 3.0f, 19.0f, 7.0f, 1.46f);
        gy.w(e, 12.0f, 12.0f, 3.0f);
        e.moveTo(21.0f, 5.0f);
        e.horizontalLineToRelative(-7.58f);
        e.lineToRelative(3.29f, -3.3f);
        e.lineTo(16.0f, 1.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-0.7f, 0.7f);
        e.lineTo(10.58f, 5.0f);
        fc.z(e, 7.52f, 2.0f, 2.0f, 21.0f);
        e.verticalLineToRelative(11.48f);
        e.lineToRelative(1.65f, 1.65f);
        e.curveToRelative(0.22f, -0.32f, 0.35f, -0.71f, 0.35f, -1.13f);
        e.verticalLineTo(7.0f);
        e.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = build;
        build.getClass();
        return build;
    }
}
