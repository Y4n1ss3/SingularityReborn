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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoffeeMakerKt {
    private static ImageVector _coffeeMaker;

    public static final ImageVector getCoffeeMaker(Icons.Outlined outlined) {
        ImageVector imageVector = _coffeeMaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CoffeeMaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(18.0f, 6.0f, 4.0f, 2.0f, 2.0f);
        c.horizontalLineTo(6.0f);
        c.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        c.verticalLineToRelative(16.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kf0.x(c, 14.0f, -2.0f, -4.03f);
        c.curveTo(17.2f, 19.09f, 18.0f, 17.64f, 18.0f, 16.0f);
        r6.s(c, -5.0f, 8.0f, 5.0f);
        c.curveToRelative(0.0f, 1.64f, 0.81f, 3.09f, 2.03f, 4.0f);
        kf0.o(c, 6.0f, 4.0f, 2.0f, 2.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(8.0f);
        c.curveTo(17.55f, 7.0f, 18.0f, 6.55f, 18.0f, 6.0f);
        uo.C(c, 10.0f, 16.0f, -3.0f, 6.0f);
        c.verticalLineToRelative(3.0f);
        c.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 10.0f, 17.65f, 10.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(13.0f, 9.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffeeMaker = build;
        build.getClass();
        return build;
    }
}
