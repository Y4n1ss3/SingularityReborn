package androidx.compose.material.icons.filled;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoFixOffKt {
    private static ImageVector _autoFixOff;

    public static final ImageVector getAutoFixOff(Icons.Filled filled) {
        ImageVector imageVector = _autoFixOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoFixOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(23.0f, 1.0f, -2.5f, 1.4f);
        e.lineTo(18.0f, 1.0f);
        e.lineToRelative(1.4f, 2.5f);
        e.lineTo(18.0f, 6.0f);
        e.lineToRelative(2.5f, -1.4f);
        e.lineTo(23.0f, 6.0f);
        gy.B(e, -1.4f, -2.5f, 23.0f, 1.0f);
        e.moveTo(14.66f, 7.22f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(-2.44f, 2.44f);
        e.lineToRelative(0.81f, 0.81f);
        e.lineToRelative(2.55f, -2.55f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(-2.34f, -2.34f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineTo(11.4f, 8.84f);
        fc.C(e, 0.81f, 0.81f, 2.45f, -2.43f);
        e.moveTo(13.88f, 13.87f);
        e.lineToRelative(-3.75f, -3.75f);
        e.lineToRelative(-6.86f, -6.86f);
        e.lineTo(2.0f, 4.53f);
        e.lineToRelative(6.86f, 6.86f);
        e.lineToRelative(-6.57f, 6.57f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(2.34f, 2.34f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(6.57f, -6.57f);
        e.lineTo(19.47f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.27f, -1.27f, -6.86f, -6.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixOff = build;
        build.getClass();
        return build;
    }
}
