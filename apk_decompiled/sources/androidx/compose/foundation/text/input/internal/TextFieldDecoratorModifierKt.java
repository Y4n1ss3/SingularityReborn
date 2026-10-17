package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.MediaType;
import defpackage.p01;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierKt {
    private static final Set<MediaType> MediaTypesAll;
    private static final Set<MediaType> MediaTypesText;

    static {
        MediaType.Companion companion = MediaType.Companion;
        MediaTypesText = p01.C(companion.getText());
        MediaTypesAll = p01.C(companion.getAll());
    }

    private static /* synthetic */ void getMediaTypesAll$annotations() {
    }

    private static /* synthetic */ void getMediaTypesText$annotations() {
    }
}
