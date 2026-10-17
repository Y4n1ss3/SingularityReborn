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
import defpackage.af0;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlindKt {
    private static ImageVector _blind;

    public static final ImageVector getBlind(Icons.Filled filled) {
        ImageVector imageVector = _blind;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Blind", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(11.5f, 3.5f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.13f, 7.12f);
        b2.curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f);
        b2.curveTo(10.72f, 5.91f, 9.99f, 5.93f, 9.4f, 6.24f);
        b2.lineToRelative(0.0f, -0.01f);
        fc.t(b2, 4.0f, 9.3f, 14.0f, 2.0f);
        b2.verticalLineToRelative(-3.54f);
        b2.lineToRelative(1.5f, -0.85f);
        b2.curveTo(7.18f, 10.71f, 7.0f, 11.85f, 7.0f, 13.0f);
        b2.verticalLineToRelative(5.33f);
        b2.lineTo(4.4f, 21.8f);
        b2.lineTo(6.0f, 23.0f);
        b2.lineToRelative(3.0f, -4.0f);
        b2.lineToRelative(0.22f, -3.54f);
        af0.m(b2, 11.0f, 18.0f, 5.0f, 2.0f);
        b2.verticalLineToRelative(-6.5f);
        b2.lineToRelative(-1.97f, -2.81f);
        b2.curveToRelative(-0.04f, -0.52f, -0.14f, -1.76f, 0.45f, -3.4f);
        b2.curveToRelative(0.75f, 1.14f, 1.88f, 1.98f, 3.2f, 2.41f);
        b2.lineTo(20.63f, 23.0f);
        b2.lineToRelative(0.87f, -0.5f);
        r6.w(b2, 16.02f, 13.0f, 17.0f, -2.0f);
        b2.curveToRelative(-0.49f, 0.0f, -2.88f, 0.17f, -4.08f, -2.21f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blind = build;
        build.getClass();
        return build;
    }
}
