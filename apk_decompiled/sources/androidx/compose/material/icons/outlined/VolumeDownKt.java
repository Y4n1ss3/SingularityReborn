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
import defpackage.af0;
import defpackage.er;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeDownKt {
    private static ImageVector _volumeDown;

    public static final ImageVector getVolumeDown(Icons.Outlined outlined) {
        ImageVector imageVector = _volumeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VolumeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(16.0f, 7.97f, 8.05f);
        h.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        h.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        uo.C(h, 5.0f, 9.0f, 6.0f, 4.0f);
        h.lineToRelative(5.0f, 5.0f);
        h.lineTo(14.0f, 4.0f);
        r6.C(h, 9.0f, 9.0f, 5.0f, 9.0f);
        h.moveTo(12.0f, 8.83f);
        h.verticalLineToRelative(6.34f);
        h.lineTo(9.83f, 13.0f);
        af0.m(h, 7.0f, 13.0f, -2.0f, 2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 12.0f, 8.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeDown = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getVolumeDown$annotations(Icons.Outlined outlined) {
    }
}
