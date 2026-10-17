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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerSettingsNewKt {
    private static ImageVector _powerSettingsNew;

    public static final ImageVector getPowerSettingsNew(Icons.Rounded rounded) {
        ImageVector imageVector = _powerSettingsNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PowerSettingsNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.lineTo(13.0f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(17.14f, 5.86f);
        b.curveToRelative(-0.39f, 0.39f, -0.38f, 1.0f, -0.01f, 1.39f);
        b.curveToRelative(1.13f, 1.2f, 1.83f, 2.8f, 1.87f, 4.57f);
        b.curveToRelative(0.09f, 3.83f, -3.08f, 7.13f, -6.91f, 7.17f);
        b.curveTo(8.18f, 19.05f, 5.0f, 15.9f, 5.0f, 12.0f);
        b.curveToRelative(0.0f, -1.84f, 0.71f, -3.51f, 1.87f, -4.76f);
        b.curveToRelative(0.37f, -0.39f, 0.37f, -1.0f, -0.01f, -1.38f);
        b.curveToRelative(-0.4f, -0.4f, -1.05f, -0.39f, -1.43f, 0.02f);
        b.curveTo(3.98f, 7.42f, 3.07f, 9.47f, 3.0f, 11.74f);
        b.curveToRelative(-0.14f, 4.88f, 3.83f, 9.1f, 8.71f, 9.25f);
        b.curveToRelative(5.1f, 0.16f, 9.29f, -3.93f, 9.29f, -9.0f);
        b.curveToRelative(0.0f, -2.37f, -0.92f, -4.51f, -2.42f, -6.11f);
        b.curveToRelative(-0.38f, -0.41f, -1.04f, -0.42f, -1.44f, -0.02f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerSettingsNew = build;
        build.getClass();
        return build;
    }
}
