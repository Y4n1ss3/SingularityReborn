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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FolderZipKt {
    private static ImageVector _folderZip;

    public static final ImageVector getFolderZip(Icons.TwoTone twoTone) {
        ImageVector imageVector = _folderZip;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FolderZip", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.0f, 16.0f, 2.0f, -2.0f, -2.0f);
        r6.D(n, -2.0f, 2.0f, -2.0f, -2.0f);
        uf.p(n, 8.0f, 4.0f, 10.0f, -4.0f);
        k4.D(n, 16.0f, 16.0f, 16.0f, -2.0f);
        kf0.w(n, 2.0f, 4.0f, 6.0f, 5.17f);
        j50.x(n, 2.0f, 2.0f, 14.0f, 2.0f);
        af0.v(n, 2.0f, 2.0f, -2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 2.0f, 16.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -2.0f, -2.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(8.0f);
        i.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        r6.B(i, 16.0f, 16.0f, 2.0f, -2.0f);
        af0.v(i, -2.0f, -2.0f, 2.0f, -2.0f);
        af0.q(i, -2.0f, 8.0f, 4.0f, 10.0f);
        uo.r(i, -4.0f, 16.0f, 16.0f, 16.0f);
        gy.o(i, -2.0f, 2.0f, 4.0f, 6.0f);
        r6.t(i, 5.17f, 2.0f, 2.0f, 14.0f);
        r6.D(i, 2.0f, 2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(i, 2.0f, 2.0f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderZip = build;
        build.getClass();
        return build;
    }
}
