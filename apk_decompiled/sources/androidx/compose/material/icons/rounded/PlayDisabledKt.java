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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayDisabledKt {
    private static ImageVector _playDisabled;

    public static final ImageVector getPlayDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _playDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 3.51f, 2.1f, 3.51f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(5.9f, 5.9f);
        i.verticalLineToRelative(6.35f);
        i.curveToRelative(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f);
        i.lineToRelative(3.45f, -2.2f);
        i.lineToRelative(6.08f, 6.08f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(3.51f, 3.51f);
        i.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        i.close();
        i.moveTo(17.68f, 12.84f);
        i.curveToRelative(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f);
        i.lineTo(9.54f, 5.98f);
        i.curveTo(9.27f, 5.81f, 8.97f, 5.79f, 8.7f, 5.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 7.75f, 7.75f, 17.68f, 12.84f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playDisabled = build;
        build.getClass();
        return build;
    }
}
