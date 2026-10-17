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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectSmallKt {
    private static ImageVector _photoSizeSelectSmall;

    public static final ImageVector getPhotoSizeSelectSmall(Icons.Filled filled) {
        ImageVector imageVector = _photoSizeSelectSmall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhotoSizeSelectSmall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(23.0f, 15.0f, -2.0f, 2.0f, 2.0f);
        bv.m(n, -2.0f, 23.0f, 11.0f, -2.0f);
        r6.p(n, 2.0f, 2.0f, -2.0f);
        k4.C(n, 23.0f, 19.0f, -2.0f, 2.0f);
        n.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        r6.B(n, 15.0f, 3.0f, -2.0f, 2.0f);
        gy.n(n, 2.0f, 15.0f, 3.0f);
        k4.C(n, 23.0f, 7.0f, -2.0f, 2.0f);
        gy.n(n, 2.0f, 23.0f, 7.0f);
        bv.y(n, 21.0f, 3.0f, 2.0f, 2.0f);
        n.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        r6.B(n, 3.0f, 21.0f, 8.0f, -6.0f);
        n.lineTo(1.0f, 15.0f);
        n.verticalLineToRelative(4.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(n, 3.0f, 7.0f, 1.0f, 7.0f);
        uo.D(n, 2.0f, 2.0f, 3.0f, 7.0f);
        k4.C(n, 15.0f, 19.0f, -2.0f, 2.0f);
        fc.x(n, 2.0f, -2.0f, 19.0f, 3.0f);
        kf0.x(n, -2.0f, 2.0f, 2.0f);
        uo.l(n, 19.0f, 3.0f, 19.0f, 19.0f);
        gy.D(n, -2.0f, 2.0f, 2.0f, -2.0f);
        n.moveTo(3.0f, 3.0f);
        n.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        gy.n(n, 2.0f, 3.0f, 3.0f);
        n.moveTo(3.0f, 11.0f);
        af0.m(n, 1.0f, 11.0f, 2.0f, 2.0f);
        r6.l(n, -2.0f, 11.0f, 3.0f);
        af0.m(n, 9.0f, 3.0f, 2.0f, 2.0f);
        uo.l(n, 11.0f, 3.0f, 7.0f, 3.0f);
        af0.m(n, 5.0f, 3.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 7.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectSmall = build;
        build.getClass();
        return build;
    }
}
