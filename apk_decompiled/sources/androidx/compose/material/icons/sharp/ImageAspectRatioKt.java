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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageAspectRatioKt {
    private static ImageVector _imageAspectRatio;

    public static final ImageVector getImageAspectRatio(Icons.Sharp sharp) {
        ImageVector imageVector = _imageAspectRatio;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImageAspectRatio", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.0f, 10.0f, -2.0f, 2.0f, 2.0f);
        bv.m(n, -2.0f, 16.0f, 14.0f, -2.0f);
        r6.p(n, 2.0f, 2.0f, -2.0f);
        n.moveTo(8.0f, 10.0f);
        af0.m(n, 6.0f, 10.0f, 2.0f, 2.0f);
        bv.m(n, -2.0f, 12.0f, 10.0f, -2.0f);
        r6.p(n, 2.0f, 2.0f, -2.0f);
        n.moveTo(22.0f, 4.0f);
        af0.m(n, 2.0f, 4.0f, 16.0f, 20.0f);
        uo.l(n, 22.0f, 4.0f, 20.0f, 18.0f);
        n.lineTo(4.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 4.0f, 6.0f, 16.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageAspectRatio = build;
        build.getClass();
        return build;
    }
}
