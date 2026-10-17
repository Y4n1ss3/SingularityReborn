package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonePausedKt {
    private static ImageVector _phonePaused;

    public static final ImageVector getPhonePaused(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phonePaused;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhonePaused", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(6.54f, 5.0f, -1.5f);
        a.curveToRelative(0.09f, 1.32f, 0.34f, 2.58f, 0.75f, 3.79f);
        a.lineToRelative(1.2f, -1.21f);
        a.curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.58f);
        a.close();
        a.moveTo(15.2f, 18.21f);
        a.curveToRelative(1.21f, 0.41f, 2.48f, 0.67f, 3.8f, 0.76f);
        a.verticalLineToRelative(-1.5f);
        a.curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, -1.2f, 1.19f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 15.5f);
        b.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        b.curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f);
        b.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b.lineToRelative(-2.2f, 2.2f);
        b.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        b.lineToRelative(2.2f, -2.21f);
        b.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        b.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(4.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.l(b, 5.03f, 5.0f, 1.5f);
        b.curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.45f, 2.58f);
        b.lineToRelative(-1.2f, 1.21f);
        b.curveToRelative(-0.4f, -1.21f, -0.66f, -2.47f, -0.75f, -3.79f);
        b.close();
        b.moveTo(19.0f, 18.97f);
        b.curveToRelative(-1.32f, -0.09f, -2.6f, -0.35f, -3.8f, -0.76f);
        b.lineToRelative(1.2f, -1.2f);
        b.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        bv.m(b, 1.51f, 15.0f, 3.0f, 2.0f);
        kf0.C(b, 7.0f, -2.0f, 19.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(b, 2.0f, 7.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonePaused = build;
        build.getClass();
        return build;
    }
}
