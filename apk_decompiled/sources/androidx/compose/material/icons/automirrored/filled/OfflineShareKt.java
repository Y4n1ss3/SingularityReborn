package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OfflineShareKt {
    private static ImageVector _offlineShare;

    public static final ImageVector getOfflineShare(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _offlineShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.OfflineShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(14.6f, 10.26f, 1.31f, 17.0f, 9.33f);
        y.lineTo(14.6f, 7.1f);
        y.verticalLineToRelative(1.28f);
        y.curveToRelative(-2.33f, 0.32f, -3.26f, 1.92f, -3.6f, 3.52f);
        y.curveToRelative(0.83f, -1.13f, 1.93f, -1.64f, 3.6f, -1.64f);
        k4.r(y, 16.0f, 23.0f, 6.0f, 23.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        fc.w(y, 4.0f, 5.0f, 2.0f, 16.0f);
        fc.x(y, 10.0f, 2.0f, 18.0f, 1.0f);
        y.horizontalLineToRelative(-8.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(8.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.lineTo(20.0f, 3.0f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(y, 18.0f, 16.0f, -8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(y, 10.0f, 4.0f, 8.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineShare = build;
        build.getClass();
        return build;
    }
}
