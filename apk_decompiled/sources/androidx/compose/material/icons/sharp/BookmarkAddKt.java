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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddKt {
    private static ImageVector _bookmarkAdd;

    public static final ImageVector getBookmarkAdd(Icons.Sharp sharp) {
        ImageVector imageVector = _bookmarkAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BookmarkAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 7.0f, -2.0f, 2.0f, -2.0f);
        gy.z(n, 7.0f, -2.0f, 5.0f, 2.0f);
        uf.p(n, 3.0f, 2.0f, 2.0f, 2.0f);
        bv.t(n, 7.0f, 19.0f, 21.0f);
        n.lineToRelative(-7.0f, -3.0f);
        n.lineToRelative(-7.0f, 3.0f);
        n.verticalLineTo(3.0f);
        n.lineToRelative(9.0f, 0.0f);
        n.curveToRelative(-0.63f, 0.84f, -1.0f, 1.87f, -1.0f, 3.0f);
        n.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        n.curveToRelative(0.34f, 0.0f, 0.68f, -0.03f, 1.0f, -0.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdd = build;
        build.getClass();
        return build;
    }
}
