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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FireplaceKt {
    private static ImageVector _fireplace;

    public static final ImageVector getFireplace(Icons.Rounded rounded) {
        ImageVector imageVector = _fireplace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fireplace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        d.moveTo(20.0f, 19.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-1.0f);
        d.verticalLineToRelative(-1.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-1.15f);
        d.curveToRelative(0.71f, -0.85f, 1.15f, -1.89f, 1.15f, -3.0f);
        d.curveToRelative(0.0f, -1.89f, -1.09f, -2.84f, -1.85f, -3.36f);
        d.curveToRelative(-1.86f, -1.27f, -2.23f, -2.78f, -2.25f, -3.72f);
        d.curveToRelative(-0.01f, -0.4f, -0.43f, -0.63f, -0.77f, -0.43f);
        d.curveToRelative(-5.8f, 3.43f, -5.15f, 7.0f, -5.13f, 7.51f);
        d.curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.24f, 3.0f);
        d.horizontalLineTo(7.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(1.0f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(5.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(d, 19.0f, 13.2f, 13.74f);
        d.curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f);
        d.curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f);
        d.curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f);
        d.curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f);
        d.curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireplace = build;
        build.getClass();
        return build;
    }
}
