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
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddedKt {
    private static ImageVector _bookmarkAdded;

    public static final ImageVector getBookmarkAdded(Icons.Outlined outlined) {
        ImageVector imageVector = _bookmarkAdded;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BookmarkAdded", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        n.moveTo(17.83f, 9.0f);
        n.lineTo(15.0f, 6.17f);
        n.lineToRelative(1.41f, -1.41f);
        n.lineToRelative(1.41f, 1.41f);
        n.lineToRelative(3.54f, -3.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(n, 1.41f, 1.41f, 17.83f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdded = build;
        build.getClass();
        return build;
    }
}
