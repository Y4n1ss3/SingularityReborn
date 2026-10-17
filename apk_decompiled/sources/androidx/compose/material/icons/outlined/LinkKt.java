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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(Icons.Outlined outlined) {
        ImageVector imageVector = _link;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Link", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.0f, 7.0f, -4.0f, 2.0f, 4.0f);
        n.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        n.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        kf0.x(n, -4.0f, 2.0f, 4.0f);
        n.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        n.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        k4.r(n, 11.0f, 15.0f, 7.0f, 15.0f);
        n.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        n.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        n.horizontalLineToRelative(4.0f);
        n.lineTo(11.0f, 7.0f);
        n.lineTo(7.0f, 7.0f);
        n.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        n.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        fc.x(n, 4.0f, -2.0f, 8.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(n, 8.0f, 2.0f, 8.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _link = build;
        build.getClass();
        return build;
    }
}
