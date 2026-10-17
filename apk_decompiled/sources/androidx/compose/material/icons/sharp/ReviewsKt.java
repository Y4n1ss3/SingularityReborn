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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReviewsKt {
    private static ImageVector _reviews;

    public static final ImageVector getReviews(Icons.Sharp sharp) {
        ImageVector imageVector = _reviews;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Reviews", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(22.0f, 2.0f, 2.0f, 20.0f);
        q.lineToRelative(4.0f, -4.0f);
        q.horizontalLineToRelative(16.0f);
        q.verticalLineTo(2.0f);
        q.close();
        q.moveTo(13.57f, 11.57f);
        q.lineTo(12.0f, 15.0f);
        q.lineToRelative(-1.57f, -3.43f);
        q.lineTo(7.0f, 10.0f);
        q.lineToRelative(3.43f, -1.57f);
        q.lineTo(12.0f, 5.0f);
        q.lineToRelative(1.57f, 3.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(q, 17.0f, 10.0f, 13.57f, 11.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reviews = build;
        build.getClass();
        return build;
    }
}
