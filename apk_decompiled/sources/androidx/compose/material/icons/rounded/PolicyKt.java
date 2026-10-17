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
import defpackage.af0;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolicyKt {
    private static ImageVector _policy;

    public static final ImageVector getPolicy(Icons.Rounded rounded) {
        ImageVector imageVector = _policy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Policy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 6.3f);
        b.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        b.lineToRelative(-7.0f, -3.11f);
        b.curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        b.lineToRelative(-7.0f, 3.11f);
        b.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        b.verticalLineTo(11.0f);
        b.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        b.curveToRelative(2.3f, -0.56f, 4.33f, -1.9f, 5.88f, -3.71f);
        b.lineToRelative(-3.12f, -3.12f);
        b.curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f);
        b.curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0.0f, -7.07f);
        b.curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0.0f);
        b.curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f);
        b.lineToRelative(2.9f, 2.9f);
        b.curveTo(20.29f, 15.69f, 21.0f, 13.38f, 21.0f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 6.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(12.0f, 12.0f, -3.0f, 0.0f);
        b2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _policy = build;
        build.getClass();
        return build;
    }
}
