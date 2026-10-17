package androidx.compose.material.icons.rounded;

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
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerKt {
    private static ImageVector _power;

    public static final ImageVector getPower(Icons.Rounded rounded) {
        ImageVector imageVector = _power;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Power", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.01f, 7.0f, 16.0f, 4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.x(i, 3.0f, -4.0f, 4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(3.0f);
        i.horizontalLineToRelative(-0.01f);
        i.curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 8.99f);
        i.verticalLineToRelative(4.66f);
        i.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.58f, 1.41f);
        i.lineTo(9.5f, 18.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-2.0f);
        i.lineToRelative(2.92f, -2.92f);
        i.curveToRelative(0.37f, -0.38f, 0.58f, -0.89f, 0.58f, -1.42f);
        i.verticalLineTo(8.99f);
        i.curveTo(18.0f, 7.89f, 17.11f, 7.0f, 16.01f, 7.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _power = build;
        build.getClass();
        return build;
    }
}
