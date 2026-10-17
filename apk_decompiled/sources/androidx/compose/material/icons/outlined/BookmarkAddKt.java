package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddKt {
    private static ImageVector _bookmarkAdd;

    public static final ImageVector getBookmarkAdd(Icons.Outlined outlined) {
        ImageVector imageVector = _bookmarkAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BookmarkAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(17.0f, 11.0f, 6.97f, -5.0f, -2.14f);
        fc.u(n, -5.0f, 2.14f, 5.0f, 6.0f);
        n.verticalLineTo(3.0f);
        n.horizontalLineTo(7.0f);
        n.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        n.verticalLineToRelative(16.0f);
        n.lineToRelative(7.0f, -3.0f);
        kp0.k(n, 7.0f, 3.0f, 11.0f, 17.0f);
        k4.C(n, 21.0f, 7.0f, -2.0f, 2.0f);
        af0.n(n, -2.0f, 7.0f, -2.0f, 5.0f);
        af0.q(n, 2.0f, 3.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdd = build;
        build.getClass();
        return build;
    }
}
