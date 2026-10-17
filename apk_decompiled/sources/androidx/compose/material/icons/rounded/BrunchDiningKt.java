package androidx.compose.material.icons.rounded;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrunchDiningKt {
    private static ImageVector _brunchDining;

    public static final ImageVector getBrunchDining(Icons.Rounded rounded) {
        ImageVector imageVector = _brunchDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrunchDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(18.0f, 8.0f, 2.0f, 4.0f, -2.0f);
        k4.B(n, 8.0f, 15.0f, 22.0f, 3.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kf0.z(n, -1.0f, 14.0f, 1.0f);
        n.curveTo(16.0f, 21.55f, 15.55f, 22.0f, 15.0f, 22.0f);
        k4.x(n, 18.0f, 15.89f, -0.4f, -0.42f);
        n.curveToRelative(-1.03f, -1.08f, -1.6f, -2.51f, -1.6f, -4.0f);
        n.verticalLineTo(3.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(4.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(8.51f);
        n.curveToRelative(0.0f, 1.46f, -0.54f, 2.87f, -1.53f, 3.94f);
        fc.t(n, 20.0f, 15.97f, 20.0f, 1.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(0.0f);
        n.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        n.horizontalLineToRelative(-2.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kf0.D(n, 15.89f, 7.0f, 16.0f, -1.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(1.0f);
        n.horizontalLineToRelative(4.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        r6.s(n, 1.0f, 2.0f, -1.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(n, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brunchDining = build;
        build.getClass();
        return build;
    }
}
