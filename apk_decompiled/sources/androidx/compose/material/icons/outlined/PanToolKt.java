package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Outlined outlined) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanTool", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 24.0f, -6.55f);
        a.curveToRelative(-1.08f, 0.0f, -2.14f, -0.45f, -2.89f, -1.23f);
        a.lineToRelative(-7.3f, -7.61f);
        a.lineToRelative(2.07f, -1.83f);
        a.curveToRelative(0.62f, -0.55f, 1.53f, -0.66f, 2.26f, -0.27f);
        a.lineTo(8.0f, 14.34f);
        a.verticalLineTo(4.79f);
        a.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        a.curveToRelative(0.17f, 0.0f, 0.34f, 0.02f, 0.51f, 0.05f);
        a.curveToRelative(0.09f, -1.3f, 1.17f, -2.33f, 2.49f, -2.33f);
        a.curveToRelative(0.86f, 0.0f, 1.61f, 0.43f, 2.06f, 1.09f);
        a.curveToRelative(0.29f, -0.12f, 0.61f, -0.18f, 0.94f, -0.18f);
        a.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        a.verticalLineToRelative(0.28f);
        a.curveToRelative(0.16f, -0.03f, 0.33f, -0.05f, 0.5f, -0.05f);
        a.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        a.verticalLineTo(20.0f);
        a.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        k4.x(a, 4.14f, 15.28f, 5.86f, 6.1f);
        a.curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f);
        a.horizontalLineTo(18.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(6.15f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(a, 12.0f, -2.0f, 3.42f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(a, 12.0f, -2.0f, 2.51f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(a, 12.0f, -2.0f, 4.79f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f);
        a.verticalLineToRelative(12.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(a, -5.35f, -2.83f, -0.51f, 0.45f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = build;
        build.getClass();
        return build;
    }
}
