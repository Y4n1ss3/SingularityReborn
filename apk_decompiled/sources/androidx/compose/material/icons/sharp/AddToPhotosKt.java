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
import defpackage.bv;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddToPhotosKt {
    private static ImageVector _addToPhotos;

    public static final ImageVector getAddToPhotos(Icons.Sharp sharp) {
        ImageVector imageVector = _addToPhotos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddToPhotos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(4.0f, 6.0f, 2.0f, 6.0f, 16.0f);
        bv.C(s, 16.0f, -2.0f, 4.0f, 20.0f);
        uo.l(s, 4.0f, 6.0f, 22.0f, 2.0f);
        af0.m(s, 6.0f, 2.0f, 16.0f, 16.0f);
        uo.l(s, 22.0f, 2.0f, 19.0f, 11.0f);
        af0.v(s, -4.0f, 4.0f, -2.0f, -4.0f);
        s.lineTo(9.0f, 11.0f);
        s.lineTo(9.0f, 9.0f);
        uo.n(s, 4.0f, 13.0f, 5.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(s, 4.0f, 4.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToPhotos = build;
        build.getClass();
        return build;
    }
}
