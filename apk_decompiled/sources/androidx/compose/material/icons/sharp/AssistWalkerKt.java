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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistWalkerKt {
    private static ImageVector _assistWalker;

    public static final ImageVector getAssistWalker(Icons.Sharp sharp) {
        ImageVector imageVector = _assistWalker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AssistWalker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.5f, 4.5f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(19.77f, 17.72f, 19.0f, 10.0f, -3.0f);
        k.curveToRelative(-1.5f, -0.02f, -2.86f, -0.54f, -3.76f, -1.44f);
        k.lineToRelative(-2.0f, -1.98f);
        k.curveTo(10.08f, 6.42f, 9.62f, 6.0f, 8.83f, 6.0f);
        k.curveTo(8.32f, 6.0f, 7.81f, 6.2f, 7.42f, 6.59f);
        k.lineToRelative(-4.2f, 4.17f);
        k.lineToRelative(2.08f, 4.07f);
        k.lineToRelative(-3.15f, 4.05f);
        k.lineToRelative(1.57f, 1.24f);
        k.lineToRelative(3.68f, -4.73f);
        k.lineToRelative(-0.17f, -1.36f);
        fc.t(k, 8.0f, 14.75f, 20.0f, 2.0f);
        k.verticalLineToRelative(-6.12f);
        k.lineToRelative(-2.12f, -2.12f);
        k.lineToRelative(2.36f, -2.36f);
        k.curveToRelative(0.94f, 0.94f, 1.72f, 1.82f, 3.59f, 2.32f);
        k.lineTo(13.0f, 20.0f);
        kf0.B(k, 1.5f, 0.41f, -3.5f, 3.18f);
        k.lineToRelative(0.14f, 1.22f);
        k.curveToRelative(-0.44f, 0.26f, -0.73f, 0.74f, -0.73f, 1.28f);
        k.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        k.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        k.curveTo(20.5f, 18.46f, 20.21f, 17.98f, 19.77f, 17.72f);
        k4.x(k, 15.09f, 15.0f, 0.41f, -3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(k, 2.0f, 0.41f, 3.5f, 15.09f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistWalker = build;
        build.getClass();
        return build;
    }
}
