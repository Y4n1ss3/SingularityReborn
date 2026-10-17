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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LineAxisKt {
    private static ImageVector _lineAxis;

    public static final ImageVector getLineAxis(Icons.TwoTone twoTone) {
        ImageVector imageVector = _lineAxis;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LineAxis", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 7.43f, -1.41f, -1.41f);
        e.lineToRelative(-4.03f, 4.53f);
        e.lineToRelative(-7.06f, -6.55f);
        e.lineToRelative(-7.5f, 7.51f);
        e.lineToRelative(1.5f, 1.5f);
        e.lineToRelative(6.14f, -6.15f);
        e.lineToRelative(5.59f, 5.18f);
        e.lineToRelative(-1.73f, 1.95f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-7.5f, 7.51f);
        e.lineToRelative(1.5f, 1.5f);
        e.lineToRelative(6.0f, -6.01f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(3.19f, -3.59f);
        e.lineToRelative(3.9f, 3.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.41f, -1.41f, -3.98f, -3.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lineAxis = build;
        build.getClass();
        return build;
    }
}
