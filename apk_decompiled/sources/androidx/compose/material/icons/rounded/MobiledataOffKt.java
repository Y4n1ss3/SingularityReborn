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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobiledataOffKt {
    private static ImageVector _mobiledataOff;

    public static final ImageVector getMobiledataOff(Icons.Rounded rounded) {
        ImageVector imageVector = _mobiledataOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MobiledataOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(16.0f, 7.0f, 1.79f);
        a.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        a.lineToRelative(-2.79f, -2.79f);
        a.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        a.lineToRelative(-2.79f, 2.79f);
        a.curveTo(11.54f, 6.46f, 11.76f, 7.0f, 12.21f, 7.0f);
        k4.q(a, 14.0f, 4.17f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(a, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 3.51f, 2.1f, 3.51f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(5.9f, 5.9f);
        i.verticalLineToRelative(6.18f);
        i.lineToRelative(-1.79f, 0.0f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        i.lineToRelative(2.79f, 2.78f);
        i.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        i.lineToRelative(2.79f, -2.79f);
        i.curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f);
        i.lineToRelative(-1.79f, 0.0f);
        i.verticalLineToRelative(-4.18f);
        i.lineToRelative(9.07f, 9.07f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(3.51f, 3.51f);
        i.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobiledataOff = build;
        build.getClass();
        return build;
    }
}
