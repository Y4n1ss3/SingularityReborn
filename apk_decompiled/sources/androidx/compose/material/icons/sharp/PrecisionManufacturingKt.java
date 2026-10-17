package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Sharp sharp) {
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PrecisionManufacturing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = bv.i(14.0f, 10.0f, 9.82f, 2.01f, 2.01f);
        i.lineToRelative(5.23f, -2.44f);
        i.lineToRelative(-0.63f, -1.36f);
        i.lineToRelative(-4.28f, 2.0f);
        i.lineTo(14.0f, 7.7f);
        i.verticalLineTo(6.3f);
        i.lineToRelative(2.33f, -2.33f);
        i.lineToRelative(4.28f, 2.0f);
        i.lineToRelative(0.63f, -1.36f);
        i.lineToRelative(-5.23f, -2.44f);
        fc.t(i, 14.0f, 4.18f, 4.0f, -2.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineTo(8.82f);
        i.curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f);
        i.curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f);
        i.curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f);
        r6.w(i, 7.08f, 18.0f, 4.0f, 3.0f);
        kf0.x(i, 13.0f, -3.0f, -3.62f);
        i.lineTo(8.41f, 8.76f);
        i.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        fc.j(i, 12.0f, 2.0f, 14.0f);
        i.moveTo(6.0f, 8.0f);
        i.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = build;
        build.getClass();
        return build;
    }
}
