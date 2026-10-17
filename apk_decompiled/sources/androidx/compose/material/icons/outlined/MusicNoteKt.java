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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicNoteKt {
    private static ImageVector _musicNote;

    public static final ImageVector getMusicNote(Icons.Outlined outlined) {
        ImageVector imageVector = _musicNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MusicNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 3.0f, 0.01f, 10.55f);
        e.curveToRelative(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
        e.curveTo(7.79f, 13.0f, 6.0f, 14.79f, 6.0f, 17.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f);
        e.reflectiveCurveTo(14.0f, 19.21f, 14.0f, 17.0f);
        e.lineTo(14.0f, 7.0f);
        uf.C(e, 4.0f, 18.0f, 3.0f, -6.0f);
        e.moveTo(10.01f, 19.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicNote = build;
        build.getClass();
        return build;
    }
}
