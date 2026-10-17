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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddKt {
    private static ImageVector _bookmarkAdd;

    public static final ImageVector getBookmarkAdd(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bookmarkAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BookmarkAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 17.97f, 0.0f, -7.07f);
        e.curveToRelative(-2.28f, -0.46f, -4.0f, -2.48f, -4.0f, -4.9f);
        e.curveToRelative(0.0f, -0.34f, 0.03f, -0.68f, 0.1f, -1.0f);
        e.lineTo(7.0f, 5.0f);
        e.verticalLineToRelative(12.97f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 5.0f, -2.14f, 17.0f, 17.97f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 7.0f, -2.0f, 2.0f, -2.0f);
        gy.z(n, 7.0f, -2.0f, 5.0f, 2.0f);
        uf.p(n, 3.0f, 2.0f, 2.0f, 2.0f);
        bv.t(n, 7.0f, 17.0f, 17.97f);
        n.lineToRelative(-5.0f, -2.14f);
        n.lineToRelative(-5.0f, 2.14f);
        n.verticalLineTo(5.0f);
        n.lineToRelative(6.1f, 0.0f);
        n.curveToRelative(0.15f, -0.74f, 0.46f, -1.42f, 0.9f, -2.0f);
        n.lineTo(7.0f, 3.0f);
        n.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        n.verticalLineToRelative(16.0f);
        n.lineToRelative(7.0f, -3.0f);
        n.lineToRelative(7.0f, 3.0f);
        n.lineToRelative(0.0f, -10.1f);
        n.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        n.curveToRelative(-0.34f, 0.0f, -0.68f, -0.03f, -1.0f, -0.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 17.0f, 17.97f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdd = build;
        build.getClass();
        return build;
    }
}
