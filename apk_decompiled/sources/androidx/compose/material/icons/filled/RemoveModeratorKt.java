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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Filled filled) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.27f, 21.73f, -3.54f, -3.55f);
        e.lineTo(5.78f, 5.23f);
        e.lineTo(2.27f, 1.72f);
        e.lineTo(1.0f, 2.99f);
        r6.w(e, 3.01f, 5.0f, 3.0f, 6.0f);
        e.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        e.curveToRelative(2.16f, -0.53f, 4.08f, -1.76f, 5.6f, -3.41f);
        bv.o(e, 21.0f, 23.0f, 1.27f, -1.27f);
        e.moveTo(13.0f, 9.92f);
        e.lineToRelative(6.67f, 6.67f);
        e.curveTo(20.51f, 14.87f, 21.0f, 12.96f, 21.0f, 11.0f);
        e.verticalLineTo(5.0f);
        e.lineToRelative(-9.0f, -4.0f);
        e.lineToRelative(-5.48f, 2.44f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 11.0f, 7.92f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = build;
        build.getClass();
        return build;
    }
}
