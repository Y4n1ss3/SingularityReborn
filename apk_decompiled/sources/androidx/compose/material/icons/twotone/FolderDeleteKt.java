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
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FolderDeleteKt {
    private static ImageVector _folderDelete;

    public static final ImageVector getFolderDelete(Icons.TwoTone twoTone) {
        ImageVector imageVector = _folderDelete;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FolderDelete", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(14.5f, 11.5f, 2.0f, 4.0f, -2.0f);
        kf0.D(n, 11.5f, 20.0f, 8.0f, 10.0f);
        uf.t(n, 4.0f, 6.0f, 5.17f);
        gy.w(n, 2.0f, 2.0f, 20.0f);
        j50.y(n, 19.0f, 10.0f, -2.5f, 9.0f);
        af0.z(n, -2.0f, 1.0f, 12.0f, 1.5f);
        n.horizontalLineToRelative(1.0f);
        n.verticalLineToRelative(4.0f);
        n.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(n, -4.0f, 1.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(16.5f, 10.0f, 9.0f, -2.0f, 1.0f);
        uf.k(c, 12.0f, 1.5f, 1.0f, 4.0f);
        c.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        c.horizontalLineToRelative(2.0f);
        c.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        uf.y(c, -4.0f, 1.0f, 10.0f, 16.5f);
        k4.C(c, 16.5f, 15.5f, -2.0f, -4.0f);
        uo.r(c, 2.0f, 15.5f, 20.0f, 6.0f);
        r6.t(c, -8.0f, -2.0f, -2.0f, 4.0f);
        c.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        c.lineTo(2.0f, 18.0f);
        c.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(16.0f);
        c.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        c.verticalLineTo(8.0f);
        c.curveTo(22.0f, 6.89f, 21.11f, 6.0f, 20.0f, 6.0f);
        c21.d(c, 20.0f, 18.0f, 4.0f, 6.0f);
        r6.t(c, 5.17f, 2.0f, 2.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(c, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderDelete = build;
        build.getClass();
        return build;
    }
}
