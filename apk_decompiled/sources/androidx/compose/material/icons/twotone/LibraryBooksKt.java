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
import defpackage.er;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LibraryBooksKt {
    private static ImageVector _libraryBooks;

    public static final ImageVector getLibraryBooks(Icons.TwoTone twoTone) {
        ImageVector imageVector = _libraryBooks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LibraryBooks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(8.0f, 16.0f, 12.0f, 20.0f, 4.0f);
        bv.r(p, 8.0f, 4.0f, 12.0f);
        k4.C(p, 10.0f, 6.0f, 8.0f, 2.0f);
        gy.n(p, -8.0f, 10.0f, 6.0f);
        k4.C(p, 10.0f, 9.0f, 8.0f, 2.0f);
        gy.n(p, -8.0f, 10.0f, 9.0f);
        k4.C(p, 10.0f, 12.0f, 4.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, -4.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(4.0f, 22.0f, 14.0f, -2.0f);
        b.lineTo(4.0f, 20.0f);
        b.lineTo(4.0f, 6.0f);
        b.lineTo(2.0f, 6.0f);
        b.verticalLineToRelative(14.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.v(b, 6.0f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(22.0f, 4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(8.0f, 2.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k4.r(b, 20.0f, 16.0f, 8.0f, 16.0f);
        r6.m(b, 8.0f, 4.0f, 12.0f, 12.0f);
        k4.C(b, 10.0f, 9.0f, 8.0f, 2.0f);
        kp0.A(b, -8.0f, 10.0f, 12.0f, 4.0f);
        kf0.C(b, 2.0f, -4.0f, 10.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(b, 8.0f, 2.0f, -8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _libraryBooks = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLibraryBooks$annotations(Icons.TwoTone twoTone) {
    }
}
