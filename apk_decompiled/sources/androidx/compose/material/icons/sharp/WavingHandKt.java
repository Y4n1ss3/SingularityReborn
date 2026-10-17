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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Sharp sharp) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WavingHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.0f, 17.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        k4.w(b, 23.0f, 1.0f, 7.0f);
        b.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b.verticalLineToRelative(1.5f);
        b.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        k4.w(b, 1.0f, 8.9f, 3.43f);
        b.lineTo(3.42f, 8.91f);
        b.curveToRelative(-3.22f, 3.22f, -3.22f, 8.44f, 0.0f, 11.67f);
        b.reflectiveCurveToRelative(8.44f, 3.22f, 11.67f, 0.0f);
        b.lineToRelative(7.95f, -7.95f);
        b.lineToRelative(-1.77f, -1.77f);
        b.lineToRelative(-5.3f, 5.3f);
        b.lineToRelative(-0.71f, -0.71f);
        b.lineToRelative(7.42f, -7.42f);
        b.lineToRelative(-1.77f, -1.77f);
        b.lineToRelative(-6.72f, 6.72f);
        b.lineToRelative(-0.71f, -0.71f);
        b.lineToRelative(7.78f, -7.78f);
        b.lineTo(19.5f, 2.73f);
        b.lineToRelative(-7.78f, 7.78f);
        b.lineTo(11.02f, 9.8f);
        b.lineToRelative(6.36f, -6.36f);
        b.lineToRelative(-1.77f, -1.77f);
        b.lineToRelative(-8.51f, 8.51f);
        b.curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f);
        b.lineToRelative(-0.71f, -0.71f);
        b.curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0.0f, -4.24f);
        b.lineToRelative(-0.35f, -0.35f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 4.95f, -4.95f, 8.9f, 3.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = build;
        build.getClass();
        return build;
    }
}
