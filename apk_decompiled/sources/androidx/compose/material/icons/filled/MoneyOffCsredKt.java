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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoneyOffCsredKt {
    private static ImageVector _moneyOffCsred;

    public static final ImageVector getMoneyOffCsred(Icons.Filled filled) {
        ImageVector imageVector = _moneyOffCsred;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MoneyOffCsred", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.53f, 7.43f);
        b.curveToRelative(0.42f, -0.31f, 0.93f, -0.47f, 1.54f, -0.47f);
        b.reflectiveCurveToRelative(1.11f, 0.16f, 1.5f, 0.49f);
        b.curveToRelative(0.39f, 0.32f, 0.65f, 0.7f, 0.79f, 1.12f);
        b.lineToRelative(1.89f, -0.8f);
        b.curveToRelative(-0.24f, -0.71f, -0.71f, -1.35f, -1.4f, -1.92f);
        b.curveToRelative(-0.5f, -0.4f, -1.12f, -0.65f, -1.85f, -0.77f);
        kf0.r(b, 3.0f, -2.0f, 2.11f);
        b.curveToRelative(-0.41f, 0.08f, -0.79f, 0.21f, -1.14f, 0.39f);
        b.curveToRelative(-0.35f, 0.18f, -0.64f, 0.39f, -0.9f, 0.63f);
        b.lineToRelative(1.43f, 1.43f);
        b.curveTo(10.43f, 7.52f, 10.48f, 7.47f, 10.53f, 7.43f);
        k4.r(b, 2.81f, 2.81f, 1.39f, 4.22f);
        b.lineToRelative(12.35f, 12.35f);
        b.curveTo(13.31f, 16.85f, 12.79f, 17.0f, 12.19f, 17.0f);
        b.curveToRelative(-0.71f, 0.0f, -1.32f, -0.23f, -1.83f, -0.7f);
        b.curveToRelative(-0.5f, -0.47f, -0.86f, -1.07f, -1.06f, -1.81f);
        b.lineToRelative(-1.98f, 0.8f);
        b.curveToRelative(0.34f, 1.17f, 0.95f, 2.08f, 1.83f, 2.73f);
        b.curveToRelative(0.57f, 0.42f, 1.19f, 0.68f, 1.85f, 0.83f);
        kf0.r(b, 21.0f, 2.0f, -2.08f);
        b.curveToRelative(0.44f, -0.07f, 0.87f, -0.17f, 1.29f, -0.35f);
        b.curveToRelative(0.34f, -0.14f, 0.64f, -0.32f, 0.92f, -0.53f);
        b.lineToRelative(4.57f, 4.57f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, -1.41f, 2.81f, 2.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moneyOffCsred = build;
        build.getClass();
        return build;
    }
}
