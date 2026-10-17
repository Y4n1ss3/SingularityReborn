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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.TwoTone twoTone) {
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Forest", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.48f, 10.0f, 1.68f, 0.0f);
        e.lineToRelative(-3.16f, -4.51f);
        e.lineToRelative(-1.78f, 2.54f);
        e.lineToRelative(2.78f, 3.97f);
        e.lineToRelative(-1.86f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 2.57f, 4.0f, 3.63f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(12.16f, 10.0f, -3.16f, -4.51f);
        e2.lineToRelative(-3.16f, 4.51f);
        e2.lineToRelative(1.68f, 0.0f);
        e2.lineToRelative(-3.86f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 10.68f, 0.0f, -3.86f, -6.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(20.14f, 12.0f, 22.0f, 15.0f, 2.0f);
        l.lineToRelative(-3.0f, 4.29f);
        l.lineTo(9.0f, 2.0f);
        l.lineTo(2.0f, 12.0f);
        uo.n(l, 1.86f, 0.0f, 18.0f, 7.0f);
        r6.D(l, 4.0f, 4.0f, -4.0f, 2.0f);
        r6.D(l, 4.0f, 4.0f, -4.0f, 7.0f);
        uo.l(l, 20.14f, 12.0f, 3.66f, 16.0f);
        l.lineToRelative(3.86f, -6.0f);
        l.horizontalLineTo(5.84f);
        l.lineTo(9.0f, 5.49f);
        l.lineTo(12.16f, 10.0f);
        uf.A(l, -1.68f, 3.86f, 6.0f, 3.66f);
        l.moveTo(16.71f, 16.0f);
        l.lineToRelative(-2.57f, -4.0f);
        l.horizontalLineTo(16.0f);
        l.lineToRelative(-2.78f, -3.97f);
        l.lineTo(15.0f, 5.49f);
        l.lineTo(18.16f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(l, -1.68f, 3.86f, 6.0f, 16.71f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = build;
        build.getClass();
        return build;
    }
}
