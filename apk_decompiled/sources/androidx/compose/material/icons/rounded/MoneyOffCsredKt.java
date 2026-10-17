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
public final class MoneyOffCsredKt {
    private static ImageVector _moneyOffCsred;

    public static final ImageVector getMoneyOffCsred(Icons.Rounded rounded) {
        ImageVector imageVector = _moneyOffCsred;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MoneyOffCsred", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 6.9f);
        b.curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f);
        b.curveToRelative(0.13f, 0.43f, 0.56f, 0.7f, 1.01f, 0.7f);
        b.horizontalLineToRelative(0.06f);
        b.curveToRelative(0.7f, 0.0f, 1.22f, -0.71f, 0.97f, -1.36f);
        b.curveToRelative(-0.44f, -1.15f, -1.41f, -2.08f, -2.93f, -2.45f);
        b.verticalLineTo(4.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(11.0f, 3.67f, 11.0f, 4.5f);
        b.verticalLineToRelative(0.66f);
        b.curveToRelative(-0.39f, 0.08f, -0.75f, 0.21f, -1.1f, 0.36f);
        b.lineToRelative(1.51f, 1.51f);
        b.curveToRelative(0.32f, -0.08f, 0.69f, -0.13f, 1.09f, -0.13f);
        b.close();
        b.moveTo(4.77f, 4.62f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(7.5f, 8.77f);
        b.curveToRelative(0.0f, 2.08f, 1.56f, 3.22f, 3.91f, 3.91f);
        b.lineToRelative(3.51f, 3.51f);
        b.curveToRelative(-0.34f, 0.49f, -1.05f, 0.91f, -2.42f, 0.91f);
        b.curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f);
        b.curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f);
        b.horizontalLineTo(8.6f);
        b.curveToRelative(-0.72f, 0.0f, -1.24f, 0.74f, -0.95f, 1.39f);
        b.curveToRelative(0.59f, 1.33f, 1.89f, 2.12f, 3.36f, 2.44f);
        b.verticalLineToRelative(0.67f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.verticalLineToRelative(-0.65f);
        b.curveToRelative(0.96f, -0.18f, 1.83f, -0.55f, 2.46f, -1.12f);
        b.lineToRelative(1.51f, 1.51f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(6.18f, 4.62f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moneyOffCsred = build;
        build.getClass();
        return build;
    }
}
