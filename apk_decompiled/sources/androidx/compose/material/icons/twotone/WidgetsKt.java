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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WidgetsKt {
    private static ImageVector _widgets;

    public static final ImageVector getWidgets(Icons.TwoTone twoTone) {
        ImageVector imageVector = _widgets;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Widgets", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(5.0f, 5.0f, 4.0f, 4.0f);
        uo.l(b, 5.0f, 9.0f, 15.0f, 15.0f);
        j50.n(b, 4.0f, 4.0f, -4.0f);
        k4.C(b, 5.0f, 15.0f, 4.0f, 4.0f);
        uo.l(b, 5.0f, 19.0f, 16.66f, 4.52f);
        b.lineToRelative(-2.83f, 2.82f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 2.83f, 2.83f, 2.83f, -2.83f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.66f, 1.69f, 11.0f, 7.34f);
        i.lineTo(16.66f, 13.0f);
        fc.C(i, 5.66f, -5.66f, -5.66f, -5.65f);
        i.moveTo(13.83f, 7.34f);
        i.lineToRelative(2.83f, -2.83f);
        i.lineToRelative(2.83f, 2.83f);
        fc.C(i, -2.83f, 2.83f, -2.83f, -2.83f);
        bv.y(i, 3.0f, 3.0f, 8.0f, 8.0f);
        r6.C(i, 11.0f, 3.0f, 3.0f, 3.0f);
        i.moveTo(9.0f, 9.0f);
        i.lineTo(5.0f, 9.0f);
        r6.m(i, 5.0f, 5.0f, 4.0f, 4.0f);
        k4.C(i, 3.0f, 21.0f, 8.0f, -8.0f);
        bv.r(i, 3.0f, 13.0f, 8.0f);
        k4.C(i, 5.0f, 15.0f, 4.0f, 4.0f);
        bv.r(i, 5.0f, 19.0f, -4.0f);
        bv.y(i, 13.0f, 13.0f, 8.0f, 8.0f);
        kf0.C(i, -8.0f, -8.0f, 19.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(i, -4.0f, -4.0f, 4.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _widgets = build;
        build.getClass();
        return build;
    }
}
