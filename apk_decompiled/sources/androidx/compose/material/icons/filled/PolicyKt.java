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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolicyKt {
    private static ImageVector _policy;

    public static final ImageVector getPolicy(Icons.Filled filled) {
        ImageVector imageVector = _policy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Policy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 5.0f, -9.0f, -4.0f);
        e.lineTo(3.0f, 5.0f);
        e.verticalLineToRelative(6.0f);
        e.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        e.curveToRelative(2.3f, -0.56f, 4.33f, -1.9f, 5.88f, -3.71f);
        e.lineToRelative(-3.12f, -3.12f);
        e.curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f);
        e.curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0.0f, -7.07f);
        e.curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0.0f);
        e.curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f);
        e.lineToRelative(2.9f, 2.9f);
        e.curveTo(20.29f, 15.69f, 21.0f, 13.38f, 21.0f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _policy = build;
        build.getClass();
        return build;
    }
}
