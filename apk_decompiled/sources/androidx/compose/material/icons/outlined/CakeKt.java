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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.Outlined outlined) {
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Cake", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        b.lineTo(12.0f, 0.0f);
        b.lineToRelative(-1.71f, 2.97f);
        b.curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.l(b, 18.0f, 9.0f, -5.0f);
        fc.w(b, 13.0f, 7.0f, -2.0f, 2.0f);
        b.lineTo(6.0f, 9.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.verticalLineToRelative(9.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-9.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        k4.r(b, 19.0f, 20.0f, 5.0f, 20.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f);
        b.lineToRelative(1.09f, -1.07f);
        b.lineToRelative(1.07f, 1.07f);
        b.curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0.0f);
        b.lineToRelative(1.08f, -1.07f);
        b.lineToRelative(1.07f, 1.07f);
        b.curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.4f, 1.01f);
        r6.l(b, 3.0f, 19.0f, 15.5f);
        b.curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f);
        b.lineToRelative(-2.13f, -2.13f);
        b.lineToRelative(-2.14f, 2.13f);
        b.curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0.0f);
        b.lineTo(8.48f, 12.8f);
        b.lineToRelative(-2.14f, 2.13f);
        b.curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f);
        b.lineTo(5.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cake = build;
        build.getClass();
        return build;
    }
}
