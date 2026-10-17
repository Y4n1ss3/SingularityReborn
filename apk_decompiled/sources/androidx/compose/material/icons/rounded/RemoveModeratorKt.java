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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Rounded rounded) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 11.09f, -4.7f);
        h.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        h.lineToRelative(-6.0f, -2.25f);
        h.curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0.0f);
        h.lineTo(6.78f, 3.96f);
        h.lineToRelative(12.09f, 12.09f);
        h.curveTo(19.59f, 14.52f, 20.0f, 12.83f, 20.0f, 11.09f);
        k4.r(h, 20.49f, 20.49f, 3.51f, 3.51f);
        h.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        h.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        h.lineTo(4.0f, 6.83f);
        h.verticalLineToRelative(4.26f);
        h.curveToRelative(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        h.curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        h.curveToRelative(1.49f, -0.48f, 2.84f, -1.35f, 3.97f, -2.47f);
        h.lineToRelative(2.53f, 2.53f);
        h.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        h.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = build;
        build.getClass();
        return build;
    }
}
