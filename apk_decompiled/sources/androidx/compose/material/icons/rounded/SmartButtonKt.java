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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartButtonKt {
    private static ImageVector _smartButton;

    public static final ImageVector getSmartButton(Icons.Rounded rounded) {
        ImageVector imageVector = _smartButton;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmartButton", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 9.0f, 6.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        kf0.B(h, -1.0f, 0.0f, -2.0f, 1.0f);
        bv.A(h, 9.0f, 4.0f, 6.0f, 6.0f);
        h.verticalLineToRelative(2.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(9.0f);
        h.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        h.horizontalLineToRelative(16.0f);
        h.curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f);
        h.close();
        h.moveTo(14.04f, 17.99f);
        h.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        h.lineToRelative(0.63f, -1.4f);
        h.lineToRelative(1.4f, -0.63f);
        h.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        h.lineToRelative(-1.4f, -0.63f);
        h.lineToRelative(-0.63f, -1.4f);
        h.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        h.lineToRelative(-0.63f, 1.4f);
        h.lineToRelative(-1.4f, 0.63f);
        h.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        gy.B(h, 1.4f, 0.63f, 14.04f, 17.99f);
        h.moveTo(16.74f, 13.43f);
        h.curveToRelative(0.1f, 0.22f, 0.42f, 0.22f, 0.52f, 0.0f);
        h.lineToRelative(0.36f, -0.8f);
        h.lineToRelative(0.8f, -0.36f);
        h.curveToRelative(0.22f, -0.1f, 0.22f, -0.42f, 0.0f, -0.52f);
        h.lineToRelative(-0.8f, -0.36f);
        h.lineToRelative(-0.36f, -0.8f);
        h.curveToRelative(-0.1f, -0.22f, -0.42f, -0.22f, -0.52f, 0.0f);
        h.lineToRelative(-0.36f, 0.8f);
        h.lineToRelative(-0.8f, 0.36f);
        h.curveToRelative(-0.22f, 0.1f, -0.22f, 0.42f, 0.0f, 0.52f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(h, 0.8f, 0.36f, 16.74f, 13.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartButton = build;
        build.getClass();
        return build;
    }
}
