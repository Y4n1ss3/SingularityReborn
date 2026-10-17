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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobiledataOffKt {
    private static ImageVector _mobiledataOff;

    public static final ImageVector getMobiledataOff(Icons.Outlined outlined) {
        ImageVector imageVector = _mobiledataOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MobiledataOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.0f, 6.82f, 1.59f, 1.59f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(1.59f, -1.59f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 4.35f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(1.39f, 4.22f, 6.61f, 6.61f);
        e2.lineToRelative(0.0f, 6.35f);
        e2.lineToRelative(-1.59f, -1.59f);
        e2.lineToRelative(-1.41f, 1.41f);
        e2.lineToRelative(4.0f, 4.0f);
        e2.lineToRelative(4.0f, -4.0f);
        e2.lineToRelative(-1.41f, -1.41f);
        e2.lineToRelative(-1.59f, 1.59f);
        e2.lineToRelative(0.0f, -4.35f);
        e2.lineToRelative(9.78f, 9.78f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 1.41f, -1.42f, -18.38f, -18.38f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobiledataOff = build;
        build.getClass();
        return build;
    }
}
