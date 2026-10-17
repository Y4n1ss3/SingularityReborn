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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectLargeKt {
    private static ImageVector _photoSizeSelectLarge;

    public static final ImageVector getPhotoSizeSelectLarge(Icons.TwoTone twoTone) {
        ImageVector imageVector = _photoSizeSelectLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoSizeSelectLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(17.0f, 19.0f, 2.0f, 2.0f, -2.0f);
        q.moveTo(1.0f, 19.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(12.0f);
        q.lineTo(15.0f, 11.0f);
        bv.r(q, 1.0f, 11.0f, 8.0f);
        q.moveTo(5.5f, 15.79f);
        q.lineToRelative(1.79f, 2.15f);
        q.lineToRelative(2.5f, -3.22f);
        q.lineTo(13.0f, 19.0f);
        bv.o(q, 3.0f, 19.0f, 2.5f, -3.21f);
        k4.C(q, 17.0f, 3.0f, 2.0f, 2.0f);
        kp0.A(q, -2.0f, 21.0f, 11.0f, 2.0f);
        kf0.C(q, 2.0f, -2.0f, 21.0f, 15.0f);
        j50.n(q, 2.0f, 2.0f, -2.0f);
        q.moveTo(3.0f, 3.0f);
        q.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        gy.n(q, 2.0f, 3.0f, 3.0f);
        k4.C(q, 21.0f, 7.0f, 2.0f, 2.0f);
        kp0.A(q, -2.0f, 13.0f, 3.0f, 2.0f);
        kf0.C(q, 2.0f, -2.0f, 21.0f, 21.0f);
        q.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        fc.x(q, -2.0f, 2.0f, 1.0f, 7.0f);
        j50.o(q, 2.0f, 2.0f, 1.0f, 9.0f);
        k4.C(q, 9.0f, 3.0f, 2.0f, 2.0f);
        uo.l(q, 9.0f, 5.0f, 5.0f, 3.0f);
        j50.o(q, 2.0f, 2.0f, 5.0f, 5.0f);
        bv.y(q, 21.0f, 3.0f, 2.0f, 2.0f);
        q.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectLarge = build;
        build.getClass();
        return build;
    }
}
