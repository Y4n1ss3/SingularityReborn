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
public final class AttachMoneyKt {
    private static ImageVector _attachMoney;

    public static final ImageVector getAttachMoney(Icons.Rounded rounded) {
        ImageVector imageVector = _attachMoney;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AttachMoney", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.8f, 10.9f);
        b.curveToRelative(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f);
        b.curveToRelative(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f);
        b.curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f);
        b.curveToRelative(0.12f, 0.4f, 0.45f, 0.7f, 0.87f, 0.7f);
        b.horizontalLineToRelative(0.3f);
        b.curveToRelative(0.66f, 0.0f, 1.13f, -0.65f, 0.9f, -1.27f);
        b.curveToRelative(-0.42f, -1.18f, -1.4f, -2.16f, -2.96f, -2.54f);
        b.verticalLineTo(4.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(10.0f, 3.67f, 10.0f, 4.5f);
        b.verticalLineToRelative(0.66f);
        b.curveToRelative(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f);
        b.curveToRelative(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f);
        b.curveToRelative(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f);
        b.curveToRelative(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f);
        b.curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f);
        b.curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f);
        b.horizontalLineToRelative(-0.28f);
        b.curveToRelative(-0.67f, 0.0f, -1.14f, 0.68f, -0.89f, 1.3f);
        b.curveToRelative(0.57f, 1.39f, 1.9f, 2.21f, 3.4f, 2.53f);
        b.verticalLineToRelative(0.67f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.verticalLineToRelative(-0.65f);
        b.curveToRelative(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f);
        b.curveToRelative(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachMoney = build;
        build.getClass();
        return build;
    }
}
