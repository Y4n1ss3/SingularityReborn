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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoneyOffCsredKt {
    private static ImageVector _moneyOffCsred;

    public static final ImageVector getMoneyOffCsred(Icons.Sharp sharp) {
        ImageVector imageVector = _moneyOffCsred;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MoneyOffCsred", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 6.9f);
        b.curveToRelative(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f);
        b.horizontalLineToRelative(2.21f);
        b.curveToRelative(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f);
        kf0.r(b, 3.0f, -3.0f, 2.16f);
        b.curveToRelative(-0.39f, 0.08f, -0.75f, 0.21f, -1.1f, 0.36f);
        b.lineToRelative(1.51f, 1.51f);
        b.curveToRelative(0.32f, -0.08f, 0.69f, -0.13f, 1.09f, -0.13f);
        k4.r(b, 5.47f, 3.92f, 4.06f, 5.33f);
        b.lineTo(7.5f, 8.77f);
        b.curveToRelative(0.0f, 2.08f, 1.56f, 3.22f, 3.91f, 3.91f);
        b.lineToRelative(3.51f, 3.51f);
        b.curveToRelative(-0.34f, 0.49f, -1.05f, 0.91f, -2.42f, 0.91f);
        b.curveToRelative(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f);
        b.horizontalLineToRelative(-2.2f);
        b.curveToRelative(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f);
        kf0.r(b, 21.0f, 3.0f, -2.15f);
        b.curveToRelative(0.96f, -0.18f, 1.83f, -0.55f, 2.46f, -1.12f);
        b.lineToRelative(2.22f, 2.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, -1.41f, 5.47f, 3.92f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moneyOffCsred = build;
        build.getClass();
        return build;
    }
}
