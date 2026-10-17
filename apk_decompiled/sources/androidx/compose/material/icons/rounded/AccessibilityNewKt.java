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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessibilityNewKt {
    private static ImageVector _accessibilityNew;

    public static final ImageVector getAccessibilityNew(Icons.Rounded rounded) {
        ImageVector imageVector = _accessibilityNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AccessibilityNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.75f, 6.99f);
        b.curveToRelative(-0.14f, -0.55f, -0.69f, -0.87f, -1.24f, -0.75f);
        b.curveToRelative(-2.38f, 0.53f, -5.03f, 0.76f, -7.51f, 0.76f);
        b.reflectiveCurveToRelative(-5.13f, -0.23f, -7.51f, -0.76f);
        b.curveToRelative(-0.55f, -0.12f, -1.1f, 0.2f, -1.24f, 0.75f);
        b.curveToRelative(-0.14f, 0.56f, 0.2f, 1.13f, 0.75f, 1.26f);
        b.curveToRelative(1.61f, 0.36f, 3.35f, 0.61f, 5.0f, 0.75f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b, -5.0f, 2.0f, 5.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(1.65f, -0.14f, 3.39f, -0.39f, 4.99f, -0.75f);
        b.curveToRelative(0.56f, -0.13f, 0.9f, -0.7f, 0.76f, -1.26f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.9f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessibilityNew = build;
        build.getClass();
        return build;
    }
}
