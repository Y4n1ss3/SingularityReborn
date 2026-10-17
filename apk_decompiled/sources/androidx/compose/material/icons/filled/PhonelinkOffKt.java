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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.Filled filled) {
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhonelinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(6.82f);
        gy.w(pathBuilder, 2.0f, 2.0f, 22.0f);
        pathBuilder.moveTo(1.92f, 1.65f);
        pathBuilder.lineTo(0.65f, 2.92f);
        pathBuilder.lineToRelative(1.82f, 1.82f);
        pathBuilder.curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f);
        af0.B(pathBuilder, 11.0f, 0.0f, 3.0f, 17.73f);
        pathBuilder.lineToRelative(2.35f, 2.35f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        r6.C(pathBuilder, 3.89f, 3.62f, 1.92f, 1.65f);
        pathBuilder.moveTo(4.0f, 6.27f);
        pathBuilder.lineTo(14.73f, 17.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(6.27f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        k4.z(pathBuilder, 4.18f, 2.0f, 2.0f, 10.0f);
        kf0.x(pathBuilder, 4.0f, 7.0f, -2.18f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkOff = build;
        build.getClass();
        return build;
    }
}
