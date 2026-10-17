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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectLargeKt {
    private static ImageVector _photoSizeSelectLarge;

    public static final ImageVector getPhotoSizeSelectLarge(Icons.Sharp sharp) {
        ImageVector imageVector = _photoSizeSelectLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhotoSizeSelectLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        bv.m(n, -2.0f, 21.0f, 19.0f, 2.0f);
        r6.p(n, 2.0f, -2.0f, -2.0f);
        k4.C(n, 21.0f, 11.0f, 2.0f, 2.0f);
        fc.x(n, -2.0f, -2.0f, 13.0f, 3.0f);
        kf0.x(n, 2.0f, 2.0f, -2.0f);
        uo.l(n, 13.0f, 3.0f, 21.0f, 7.0f);
        kf0.x(n, 2.0f, 2.0f, -2.0f);
        uo.l(n, 21.0f, 7.0f, 1.0f, 7.0f);
        bv.C(n, 2.0f, 2.0f, 1.0f, 9.0f);
        uo.l(n, 1.0f, 7.0f, 17.0f, 3.0f);
        kf0.x(n, 2.0f, 2.0f, -2.0f);
        uo.l(n, 17.0f, 3.0f, 17.0f, 19.0f);
        gy.D(n, 2.0f, 2.0f, -2.0f, -2.0f);
        n.moveTo(3.0f, 3.0f);
        af0.m(n, 1.0f, 3.0f, 2.0f, 2.0f);
        uo.l(n, 3.0f, 3.0f, 23.0f, 3.0f);
        kf0.x(n, -2.0f, 2.0f, 2.0f);
        uo.l(n, 23.0f, 3.0f, 9.0f, 3.0f);
        bv.C(n, 2.0f, 2.0f, 9.0f, 5.0f);
        uo.l(n, 9.0f, 3.0f, 5.0f, 3.0f);
        bv.C(n, 2.0f, 2.0f, 5.0f, 5.0f);
        uo.l(n, 5.0f, 3.0f, 1.0f, 11.0f);
        uo.B(n, 10.0f, 14.0f, 15.0f, 11.0f);
        uo.l(n, 1.0f, 11.0f, 3.0f, 19.0f);
        n.lineToRelative(2.5f, -3.21f);
        n.lineToRelative(1.79f, 2.15f);
        n.lineToRelative(2.5f, -3.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(n, 13.0f, 19.0f, 3.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectLarge = build;
        build.getClass();
        return build;
    }
}
